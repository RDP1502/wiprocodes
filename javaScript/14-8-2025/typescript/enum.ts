enum HttpCode{
    OK=200,
    NOTFOUND=404,
    ACCESSDENIED=403,
    INTERNALERRO=500
}

let httpcodeOk = HttpCode.OK
let httpcodenF = HttpCode.NOTFOUND
let httpcodead = HttpCode.ACCESSDENIED
let httpcodeie = HttpCode.INTERNALERRO
console.log(httpcodeOk, httpcodenF,httpcodead,httpcodeie)