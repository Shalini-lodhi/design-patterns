class MobileDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Mobile Display: Temperature updated to " + temperature + "°C");
    }
}

class TVDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("TV Display: Temperature updated to " + temperature + "°C");
    }
}
