import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        Car	car1 = new Car("Audi",19,"FFFF-S442D");
        Car car2 = new Car("Audi",20,"SSSS-44888");
        Car car3 = new Car("Audi",14,"THTH-812");
        // System.out.println(car1);

        // Task 1)  Changing properties***************//
        // car1.setName("Mersedes-Benz 190E");
        // car1.setAge(1992);
        // car1.setVin("FFFF-4511F");
        // System.out.println("New Car:"+car1);

        // Task 2)
        ArrayList<Car> carsArrayList = new ArrayList<>();
        carsArrayList.add(car1);
        carsArrayList.add(car2);
        carsArrayList.add(car3);
        // System.out.println(carsArrayList);

//        for(Car f:carsArrayList){
//            System.out.println(f);
//        }

//        Task 3)
//        Collections.sort(carsArrayList,new SortByName());
//        System.out.println("Sorted by Name " + carsArrayList);
//        Collections.sort(carsArrayList,new SortByName());
//        System.out.println("Sorted by Name"+carsArrayList);

//        Task 4)
        Car f = getCarByAge(carsArrayList,20);
        System.out.println(f);


    }
    public static Car getCarByAge(ArrayList<Car> list,int age){
        Car res = null;
        for(Car s:list){
            if(s.getAge() == age){
                res = s;
            }
        }
        return res;
    }
}

class Car{
    String name;
    int age;
    String vin;

    public Car(String name,int age,String vin){
        this.name = name;
        this.age = age;
        this.vin = vin;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getVin(){
        return vin;
    }
    public void setVin(String vin){
        this.vin = vin;
        }

    public String toString(){
        return "Name: "+name +" Age: "+age+" Vincode: "+vin;
    }
}
class SortByName implements Comparator<Car>{

    @Override
    public int compare(Car first, Car second) {
        if(first.getName().compareTo(second.getName())==0){
            if(first.getAge()== second.getAge()){
                return 0;
            }else if(first.getAge()>second.getAge()){
                return -1;
            }else{
                return 1;
            }
        }
        else if(first.getName().compareTo(second.getName())==1){
            return 1;
        }else{
            return -1;
        }

    }
}

class SortByAge implements Comparator<Car>{

    @Override
    public int compare(Car first, Car second) {
        if(first.getAge()==second.getAge()){
            return 0;
        }else if(first.getAge()>second.getAge()){
            return 1;
        }else{
            return -1;
        }
    }
}

class SortByVin implements Comparator<Car>{

    @Override
    public int compare(Car first, Car second) {
        return first.getVin().compareTo(second.getVin());
    }
}