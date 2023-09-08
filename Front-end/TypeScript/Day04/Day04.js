"use strict";
// json 
// it stores data in key value format
Object.defineProperty(exports, "__esModule", { value: true });
exports.Myclass = void 0;
var jsonobj = {
    id: 9,
    "fname": 'Srinidhi',
    'lname': "mohan"
};
// keyname should be started with character and all alpha numeric allowed 
// access - 1. dot operator 2. square operator
//square operator
// console.log(`
//        ID         :: ${jsonobj["id"]}
//        First Name :: ${jsonobj["fname"]}
//        Last Name  :: ${jsonobj["lname"]}
// `);
// Blank json object mention type
// dot operator
// console.log(`
//        ID         :: ${jsonobj.id}
//        First Name :: ${jsonobj.fname}
//        Last Name  :: ${jsonobj.lname}
// `);
// Array of object 
var arrObj = [
    {
        id: 7,
        fname: "Prema",
        lname: "Vellaisamy",
        country: {
            cid: 1,
            cname: "India"
        },
        month: ["Jan", "Feb", "March"],
        result: [
            {
                subject: "m1",
                marks: 40
            },
            {
                subject: "m2",
                marks: 50,
            },
            {
                subject: "m3",
                marks: 60,
            }
        ]
    },
    {
        id: 8,
        fname: "SaiShree",
        lname: "GR",
        country: {
            cid: 1,
            cname: "US"
        },
        month: ["Jan", "Feb", "March"],
        result: [
            {
                subject: "m1",
                marks: 60
            },
            {
                subject: "m2",
                marks: 70,
            },
            {
                subject: "m3",
                marks: 80,
            }
        ]
    },
    {
        id: 9,
        fname: "Sridevi",
        lname: "Balaji",
        country: {
            cid: 1,
            cname: "Japan"
        },
        month: ["Jan", "Feb", "March"],
        result: [
            {
                subject: "m1",
                marks: 50
            },
            {
                subject: "m2",
                marks: 60,
            },
            {
                subject: "m3",
                marks: 70,
            }
        ]
    }
];
// for(let i=0; i<arrObj.length;i++){
//     console.log(`
//     ID              :: ${arrObj[i].id}
//     First name      :: ${arrObj[i].fname}
//     Last name       :: ${arrObj[i].lname}
//     Country         :: ${arrObj[i].country.cname}
//     Month           :: ${arrObj[i].month.join(" | ")}
//     `)
//     // for(let j =0; j<arrObj[i].result.length;j++){
//     //     console.log(`
//     //         Subject    :: ${arrObj[i].result[j].subject},
//     //         Marks      :: ${arrObj[i].result[j].marks}
//     //     `)
//     // }
//     arrObj[i].result.forEach((item)=>{
//         console.log(`
//                  Subject    :: ${item.subject},
//                  Marks      :: ${item.marks}
//         `);
//     });
// }
// Additional features of typescript 
var Myclass = /** @class */ (function () {
    // constructor(){
    //     console.log("No arg const");
    // }
    function Myclass(id, fname, lname) {
        this.id = id,
            this.fname = fname,
            this.lname = lname;
    }
    Myclass.prototype.display = function () {
        console.log("\n        Id   :: ".concat(this.id, "\n        fname :: ").concat(this.fname, "\n        lname :: ").concat(this.lname, "\n        "));
    };
    return Myclass;
}());
exports.Myclass = Myclass;
// only one constructor allowed ... no multiple constructor allowed
// let obk = new Myclass(9,"Srinidhi","Mohan");
// obk.display();
// Access modifiers - public, private, protected --- same scope as java but there is no default if access specifier is not mentioned then it will be considered as public
