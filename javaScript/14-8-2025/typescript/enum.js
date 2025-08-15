var HttpCode;
(function (HttpCode) {
    HttpCode[HttpCode["OK"] = 200] = "OK";
    HttpCode[HttpCode["NOTFOUND"] = 404] = "NOTFOUND";
    HttpCode[HttpCode["ACCESSDENIED"] = 403] = "ACCESSDENIED";
    HttpCode[HttpCode["INTERNALERRO"] = 500] = "INTERNALERRO";
})(HttpCode || (HttpCode = {}));
var httpcodeOk = HttpCode.OK;
var httpcodenF = HttpCode.NOTFOUND;
var httpcodead = HttpCode.ACCESSDENIED;
var httpcodeie = HttpCode.INTERNALERRO;
console.log(httpcodeOk, httpcodenF, httpcodead, httpcodeie);
