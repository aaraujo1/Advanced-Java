package ch13.work.command;

public class CommodityFactory {
    public Commodity getCommodity(CommodityType commodityType){
        switch (commodityType){
            case BEANS: return new Beans();
            case CORN: return new Corn();
            case WHEAT: return new Wheat();
            default: return null;
        }


    }
}
