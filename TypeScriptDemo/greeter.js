function greeter(person) {
    return "Hello, " + person.firstName + "," + person.lastName;
}
var student = (function () {
    function student(firstName, middlename, lastName) {
        this.firstName = firstName;
        this.middlename = middlename;
        this.lastName = lastName;
        this.fullname = firstName + "." + middlename + "." + lastName;
    }
    return student;
}());
var user = new student("tobin", "T", "Madathil");
document.body.innerHTML = greeter(user);
