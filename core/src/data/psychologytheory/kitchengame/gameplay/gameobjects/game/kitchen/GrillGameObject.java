package data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.io.MouseInput;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;
import data.psychologytheory.kitchengame.gameplay.gameobjects.InteractableGameObject;

public class GrillGameObject extends AbstractKitchenGameObject {
    private boolean isGrillOn = false;

    public GrillGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures, zIndex, canMove, canInteract);
        this.isGrillOn = isGrillOn;
    }

    @Override
    public void render() {
        if (isGrillOn) {
            RenderHelper.getInstance().renderTexture(this.getTextures()[1], (int) this.getObjPosX(), (int) this.getObjPosY());
        } else {
            RenderHelper.getInstance().renderTexture(this.getTextures()[0], (int) this.getObjPosX(), (int) this.getObjPosY());
        }

        if (this.getDishes() != null) {
            RenderHelper.getInstance().renderPartialTexture(this.getDishes()[0].getDishPartialTextures()[0], (int) this.getObjPosX() + 2, (int) this.getObjPosY() + 40);
            RenderHelper.getInstance().renderPartialTexture(this.getDishes()[0].getDishPartialTextures()[0], (int) this.getObjPosX() + 30, (int) this.getObjPosY() + 40);
        }
    }

    @Override
    public void runInteraction() {
        if (MouseInput.getMousePosX() >= this.getObjPosX() * KitchenGame.currentRatio && MouseInput.getMousePosX() <= (this.getObjPosX() + this.getObjWidth()) * KitchenGame.currentRatio &&
                MouseInput.getMousePosY() >= this.getObjPosY() * KitchenGame.currentRatio && MouseInput.getMousePosY() <= (this.getObjPosY() + this.getObjHeight()) * KitchenGame.currentRatio) {
            if (MouseInput.isMouseButtonPressed(Input.Buttons.LEFT)) {
                this.isGrillOn = !this.isGrillOn;
            }
        }
    }
}
