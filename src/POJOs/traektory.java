/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOs;

/**
 *
 * @author korabel245
 */
public class traektory {
    
    public int id, xs, xe, ys, ye, zdepth, r, gt, feed;

    public traektory(int id, int xs, int xe, int ys, int ye, int zdepth, int r, int gt, int feed) {
        this.id = id;
        this.xs = xs;
        this.xe = xe;
        this.ys = ys;
        this.ye = ye;
        this.zdepth = zdepth;
        this.r = r;
        this.gt = gt;
        this.feed = feed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getXs() {
        return xs;
    }

    public void setXs(int xs) {
        this.xs = xs;
    }

    public int getXe() {
        return xe;
    }

    public void setXe(int xe) {
        this.xe = xe;
    }

    public int getYs() {
        return ys;
    }

    public void setYs(int ys) {
        this.ys = ys;
    }

    public int getYe() {
        return ye;
    }

    public void setYe(int ye) {
        this.ye = ye;
    }

    public int getZdepth() {
        return zdepth;
    }

    public void setZdepth(int zdepth) {
        this.zdepth = zdepth;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getGt() {
        return gt;
    }

    public void setGt(int gt) {
        this.gt = gt;
    }

    public int getFeed() {
        return feed;
    }

    public void setFeed(int feed) {
        this.feed = feed;
    }

    

    
}
