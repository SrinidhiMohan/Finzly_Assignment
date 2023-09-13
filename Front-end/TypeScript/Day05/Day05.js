"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Rectangle = exports.Shape = void 0;
var Shape = /** @class */ (function () {
    function Shape() {
    }
    Shape.prototype.myarea = function () {
        console.log("In shape class");
    };
    return Shape;
}());
exports.Shape = Shape;
var Rectangle = /** @class */ (function (_super) {
    __extends(Rectangle, _super);
    function Rectangle(l, b) {
        var _this = _super.call(this) || this;
        _this.length = l;
        _this.breadth = b;
        return _this;
    }
    Rectangle.prototype.myarea = function () {
        this.area = this.length * this.breadth;
    };
    Rectangle.prototype.display = function () {
        console.log("\n    _____________Rectangle Area _________________\n    length :: ".concat(this.length, "\n    breadth :: ").concat(this.breadth, "\n    area    :: ").concat(this.area, "\n    "));
    };
    return Rectangle;
}(Shape));
exports.Rectangle = Rectangle;
var rectangle = new Rectangle(10, 20);
rectangle.myarea();
rectangle.display();
// class Bird{
//     Bird(){
//     }
// }
// console.log("I am a bird");
// var obj = new Bird();   
