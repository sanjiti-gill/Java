class vehicle{
    int base_speed=90;

    int maxspeed(){
        return base_speed;
    }

    public static void main(String[] args){
        vehicle v1= new vehicle();
        vehicle v2=new bike();
        vehicle v3=new car();

        System.out.println("vehicle speed" + v1.maxspeed());
        System.out.println("bike speed" + v2.maxspeed());
        System.out.println("car speed" + v3.maxspeed());

        
    }
}

class bike extends vehicle{
    int bike_speed=140;

    int maxspeed(){
        return bike_speed;
    }

}

class car extends vehicle{
    int car_speed=100;

    int maxspeed(){
        return car_speed;
    }


}
