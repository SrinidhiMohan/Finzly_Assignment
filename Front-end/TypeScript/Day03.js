//Day03 - Task
// let a:number[] =[10,20,30];
// //let a:number[] = [];
// // let a2 = [2.4,3.4,5.6];
// // let a3:(String|number|boolean)[];
// let a4:any=[5,"Srinidhi",6.9,true]
// for(let i=0;i<a.length;i++){
//     console.log(a[i]+" "+i);
// }
// console.log(a4);
// console.log(a4.join("|"));
// Optional parameter
function add1(a, b) {
    console.log(a);
    console.log(b); // if parameter not passed then undefined and any operations on it would be NAN
    console.log(a + b); // non initializer should be specified or elese error would occur
}
// if parameter is optional then every parameter after that should be optional
//add1(12)
// Default parameter fuction
function addd3(a, b) {
    if (b === void 0) { b = 10; }
    console.log(a);
    console.log(b);
    console.log(a + b);
}
//addd3(12)
// Array basics  
var a = [10, 20, 30];
//let a:number[] = [];
// let a2 = [2.4,3.4,5.6];
// let a3:(String|number|boolean)[];
var a4 = [5, "Srinidhi", 6.9, true];
// for(let i=0;i<a.length;i++){
//     console.log(a[i]+" "+i);
// }
// console.log(a4);
// console.log(a4.join("|"));
// // Foreach 
// a.forEach((anyname,i,array)=>{
// console.log(anyname+" "+i + " "+ array);
// })
// For each if modification performed will not reflect in the main array
// Rest parameter and spread operator
function display() {
    var item = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        item[_i] = arguments[_i];
    }
    console.log(item);
}
// it takes any number of parameters but after rest parameter we can't create any parameter but before the rest parameter we can add parameter
// display(12,34,56,67);
// Push and Pop
var b = [];
b.push(40);
b.push(70);
b.push(90);
b.push(40);
//console.log(b);
var res = b.pop();
//console.log(res);
// Splice method
var c = [40, 50, 70, 10, 20, 100, 30];
c.splice(2, 0, 100);
//console.log(c);
c.splice(2, 1, 0);
//console.log(c);
c.splice(2, 2);
//console.log(c);
c.splice(4, 1, 600);
//console.log(c);
c.splice(2, 1, 700, 800);
//console.log(c);
// Map method - it performs element by element operation
var d = [1, 2, 3, 4, 5, 6];
var sqrarr = d.map(function (value) {
    return (value * value);
});
// console.log(d);
// console.log(sqrarr);
// slice method 
var strcourse = ["core java", "springboot", "angular 12", "docker", "AWS"];
var ateredarr = strcourse.slice(1, 5);
console.log(strcourse);
console.log(ateredarr);
