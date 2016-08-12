interface Person{
  firstName:string,
  lastName:string
}
function greeter(person:Person) {
    return "Hello, " + person.firstName +","+person.lastName;
}
class student{
  fullname:string
  constructor(public firstName,public middlename,public lastName){
    this.fullname=firstName+"."+middlename+"."+lastName;
  }
}
var user = new student("tobin","T","Madathil");

document.body.innerHTML = greeter(user);
