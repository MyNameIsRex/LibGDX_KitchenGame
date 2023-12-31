package data.psychologytheory.kitchengame.gameplay.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;

public abstract class AbstractGameObject {
    private int objID;
    private float objWidth, objHeight;
    private float objPosX, objPosY;
    private String objName;
    private Texture texture;
    private int zIndex;

    public AbstractGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, int zIndex) {
        this.objID = objID;
        this.objWidth = objWidth;
        this.objHeight = objHeight;
        this.objPosX = objPosX;
        this.objPosY = objPosY;
        this.objName = objName;
        this.texture = texture;
        this.zIndex = zIndex;
    }

    public void update() {

    }

    public void render() {
        RenderHelper.getInstance().renderTexture(this);
    }

    public int getObjID() {
        return objID;
    }

    public void setObjID(int objID) {
        this.objID = objID;
    }

    public float getObjWidth() {
        return objWidth;
    }

    public void setObjWidth(float objWidth) {
        this.objWidth = objWidth;
    }

    public float getObjHeight() {
        return objHeight;
    }

    public void setObjHeight(float objHeight) {
        this.objHeight = objHeight;
    }

    public float getObjPosX() {
        return objPosX;
    }

    public void setObjPosX(float objPosX) {
        this.objPosX = objPosX;
    }

    public float getObjPosY() {
        return objPosY;
    }

    public void setObjPosY(float objPosY) {
        this.objPosY = objPosY;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public int getZIndex() {
        return zIndex;
    }

    public void setZIndex(int zIndex) {
        this.zIndex = zIndex;
    }
}
