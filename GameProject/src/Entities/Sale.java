package Entities;

import Abstract.Entity;

public class Sale implements Entity {
    private int id;
    private Game game;
    private User seller;
    private User customer;
    private Campaign campaign;
    //private double salePrice;


    public Sale(int id, Game game, User seller,User customer, Campaign campaign) {
        this.id = id;
        this.game = game;
        this.seller=seller;
        this.customer=customer;
        this.campaign = campaign;
        //this.salePrice = salePrice;
    }

    public Sale() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Campaign getCampaign() {
        return this.campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public double getSalePrice() {
        return this.game.getUnitPrice()-(this.game.getUnitPrice() * this.campaign.getDiscount()/100);
    }

}
