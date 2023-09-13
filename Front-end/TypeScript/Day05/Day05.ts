// Day 05 task


// Single Level Inheritance

export class Shape{

    myarea(){
        console.log("In shape class");
    }

}

export class Rectangle extends Shape{
length:number;
breadth:number;
area:number;

constructor(l:number , b:number){
super();
this.length =l;
this.breadth=b;

}

override myarea(): void {
    this.area = this.length *this.breadth;
}
display(){
    console.log(`
    _____________Rectangle Area _________________
    length :: ${this.length}
    breadth :: ${this.breadth}
    area    :: ${this.area}
    `);
}

}







let rectangle = new Rectangle(10,20);
rectangle.myarea();
rectangle.display();

// Multi Level inheritance 

export class Car{
speed(){
    console.log("Speed in Car");
}
}
class Maruti extends Car{
    override speed(){
        console.log("Speed in Maruti");
    }
}
class Maruti800 extends Maruti{
    
override speed():void{
    console.log("Speed in Maruti 800");
}
}


let carObj = new Maruti800();
carObj.speed();




// class Bird{
//     Bird(){

//     }
// }
// console.log("I am a bird");
// var obj = new Bird();   