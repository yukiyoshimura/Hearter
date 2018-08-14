var stompClient = null;

// Websocket接続有無に応じて状態を変更
function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#messages").html("");
}

function connect() {
    var socket = new SockJS('/chat-endpoint'); //WebSocketに接続
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/messages', function (msg) {
            addmessages(JSON.parse(msg.body).content);
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

// メッセージ送信時に呼び出し
function sendName() {
    stompClient.send("/app/message", {}, JSON.stringify({'name': $("#name").val()}));
}

// メッセージを画面に挿入
function addmessages(message) {
    $("#messages").append("<tr><td>" + message + "</td></tr>");
}


// init処理
$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#send" ).click(function() { sendName(); });
});