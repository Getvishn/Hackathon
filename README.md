This is a spring boot application which serves employee creation and provides empoyee details.
To start the application execute mvn spring-boot:run command in cmd or terminal
Application will start up at 8090 port
User can create employee by psoting the following request payload to http://localhost:8090/empinfo
{
    "empId": "Emp10",
    "empName": "xxx",
    "empSalary": "yyyyyy"
}
User can get the employee detail by using http://localhost:8090/empinfo/Emp10

This application has a depemdency to load a json file from harddisk at "C:\\tmp\\employees.json" or /tmp/employee.json with the following contents. If is not available spring boot application wont start.
{
"employees":[
{"empId": "Emp10","empName": "xxx","empSalary": "yyyyyy"},
{"empId": "Emp10","empName": "xxx","empSalary": "yyyyyy"},
{"empId": "Emp10","empName": "xxx","empSalary": "yyyyyy"},
{"empId": "Emp10","empName": "xxx","empSalary": "yyyyyy"},
{"empId": "Emp10","empName": "xxx","empSalary": "yyyyyy"},
{"empId": "Emp10","empName": "xxx","empSalary": "yyyyyy"},
{"empId": "Emp10","empName": "xxx","empSalary": "yyyyyy"},
{"empId": "Emp10","empName": "xxx","empSalary": "yyyyyy"},
{"empId": "Emp10","empName": "xxx","empSalary": "yyyyyy"},
{"empId": "Emp10","empName": "xxx","empSalary": "yyyyyy"}
]
}
