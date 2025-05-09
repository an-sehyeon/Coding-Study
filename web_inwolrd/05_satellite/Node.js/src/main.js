var http = require("http");

http.createServer(function(request, response){
    // Header 전송
    // 서버 전송 성공 : 200을 세팅
    response.writeHead(200, {"Content-Type": "text/html"});

    // This is the first Node.js work을 display
    response.end("<h1>This is the first Node.js work</h1>");
}).listen(10002);

/* First Work */
console.log("This is the first Node.js work!");