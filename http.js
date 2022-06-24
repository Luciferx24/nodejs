const http = require('http');

const server = http.createServer(function(req, res){
    res.write("Madarchod ");
    res.end();
})

server.listen(500); 