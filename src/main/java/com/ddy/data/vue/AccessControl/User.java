package com.ddy.data.vue.AccessControl;

public interface User {
    public static interface Main{

    }

    public static interface Admin extends Main{

    }

    public static interface Client extends Admin{

    }

}
