package enumExample;

public enum Week {
    Monday , Tuesday , Wednesday ,Thursday ,Friday ,Saturday;
    //These are enums Constants
    //public , static , final keywords can be used
    //since its final u cant create child enums
    //type is Basic

    Week(){
        System.out.println("Constructor called  for "+this);
        // this is not public or protected its only private and default
        //why? we don't want to create new objects
        // this is not the enum concept that's why

        // internally: public static final  Week Monday =new Week()
    }

}

