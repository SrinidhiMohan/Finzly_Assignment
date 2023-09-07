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
function add1(a:number,b?:number){
    console.log(a);
    console.log(b); // if parameter not passed then undefined and any operations on it would be NAN
    console.log(a+b!); // non initializer should be specified or elese error would occur
}
// if parameter is optional then every parameter after that should be optional
//add1(12)

// Default parameter fuction

function addd3(a:number,b:number=10){
    console.log(a);
    console.log(b); 
    console.log(a+b);
}

//addd3(12)

// Array basics  
let a:number[] =[10,20,30];
//let a:number[] = [];
// let a2 = [2.4,3.4,5.6];
// let a3:(String|number|boolean)[];

let a4:any=[5,"Srinidhi",6.9,true]
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

function display(...item:number[]){
    console.log(item);
}
// it takes any number of parameters but after rest parameter we can't create any parameter but before the rest parameter we can add parameter
// display(12,34,56,67);

// Push and Pop
let b:number[] =[]
b.push(40);
b.push(70);
b.push(90);
b.push(40);
//console.log(b);
let res = b.pop();
//console.log(res);

// Splice method

let c:number[] =[40,50,70,10,20,100,30]
c.splice(2,0,100);
//console.log(c);
c.splice(2,1,0);
//console.log(c);
c.splice(2,2);
//console.log(c);
c.splice(4,1,600);
//console.log(c);
c.splice(2,1,700,800);
//console.log(c);

// Map method - it performs element by element operation
let d:number[] = [1,2,3,4,5,6]
let sqrarr= d.map((value)=>{
    return (value*value)
})
// console.log(d);
// console.log(sqrarr);

// slice method 
let strcourse:string[]=["core java","springboot", "angular 12","docker","AWS"]

let ateredarr = strcourse.slice(1,5); // returns a copy of a section of array // does not alter the original array
console.log(strcourse);
console.log(ateredarr);



