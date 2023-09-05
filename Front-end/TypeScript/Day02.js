// Type Assertion
var a;
// var temp =(<string>a);
// var temp1 = (a as string);
// Functions 
// without parameter without return
function add1() {
    console.log("without parameter without return");
}
// with parameter without return
function add2(a, b) {
    console.log(" Result is " + (a + b));
}
// without parameter with return
function add3() {
    return 8;
}
// with parameter with return
function add4(a, b) {
    return (a + b);
}
//////////////// Anonymous Function ------------------//////////////////////
// let temp1 = function (){
//     console.log("without parameter without return");
// }
// temp1();
// // with parameter without return
// let temp2 = function (a:number, b:number){
//     console.log(" Result is " +(a+b))
// }
// temp2(1,2);
// // without parameter with return
// let temp3 = function ():number{
//     return 8;
// }
// console.log(temp3());
// // with parameter with return
// let temp4 =function (a:number,b:number):number{
//     return (a+b);
// }
// console.log(temp4(2,4));
///////// Arrow Function -------------------------------//////////////
var temp1 = function () {
    console.log("without parameter without return");
};
temp1();
// with parameter without return
var temp2 = function (a, b) {
    console.log(" Result is " + (a + b));
};
temp2(1, 2);
// without parameter with return
var temp3 = function () {
    return 8;
};
console.log(temp3());
// with parameter with return
var temp4 = function (a, b) {
    return (a + b);
};
console.log(temp4(2, 4));
