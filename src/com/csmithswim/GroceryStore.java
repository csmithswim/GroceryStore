package com.csmithswim;
//Keep inventory of store using Hashmap
//Keep track of cash on floor
//When you make the constructor of a child/subcomponent class, do you have to pass the exact same parameters as the base class in the child constructor?

public class GroceryStore {

    private boolean isWorking = true;

    public GroceryStore(boolean isWorking){
        this.isWorking = isWorking;
//        System.out.println("GroceryStore");
    }

//    public void

    public void scheduleEmployee() {
        isWorking = true;
    }

    public void removeEmployee() {
        isWorking = false;
    }

    public boolean isWorking(){
        return isWorking;
    }

}
