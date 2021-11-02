package cz.cvut.fel.omo.cv6.state;


public class Go extends State{
    
    public Go(Context context){
        super(context);
        color = Color.GREEN;
        period = LightPeriod.GREEN_LIGHT_PERIOD.getValue();
    }
    
    @Override
    protected void changeToNextStep(){
    context.setState(new Attention(context));
    }
}

