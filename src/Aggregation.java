//Aggregation is a term which is used to refer one way relationship between two objects. For example, Student class can have reference of Address class but vice versa does not make sense
//class Address{ //class B
//        int street_no;
//        String city;
//        String state;
//        int pin;
//        Address(int street_no, String city, String state, int pin ){
//        this.street_no = street_no;
//        this.city = city;
//        this.state = state;
//        this.pin = pin;
//        }
//        }
//
//class Student //class A
//{
//    String name;
//    Address ad; //The Student class has an instance variable of type Address,it can use Address reference which is ad in this case, to invoke methods of the Address class.
//    public static void main(String[] args)
//    {
//
//    }
//}

//aggregation represents HAS-A relationship, which means when a class contains reference of another class known to have aggregation.
//class A has-a relationship with class B, if class A has a reference to an instance of class B.