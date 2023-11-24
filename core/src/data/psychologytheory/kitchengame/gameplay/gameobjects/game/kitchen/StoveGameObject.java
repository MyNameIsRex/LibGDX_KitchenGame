package data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.engine.io.MouseInput;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.gameobjects.InteractableGameObject;

public class StoveGameObject extends InteractableGameObject {
    private boolean isStoveOn = false;

    public StoveGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures, zIndex, canMove, canInteract);
    }

    @Override
    public void render() {
        if (isStoveOn) {
            RenderHelper.getInstance().renderTexture(this.getTextures()[1], (int) this.getObjPosX(), (int) this.getObjPosY());
        } else {
            RenderHelper.getInstance().renderTexture(this.getTextures()[0], (int) this.getObjPosX(), (int) this.getObjPosY());
        }
    }

    @Override
    public void runInteraction() {
        if (MouseInput.getMousePosX() >= this.getObjPosX() && MouseInput.getMousePosX() <= this.getObjPosX() + this.getObjWidth() &&
                MouseInput.getMousePosY() >= this.getObjPosY() && MouseInput.getMousePosY() <= this.getObjPosY() + this.getObjHeight()) {
            if (MouseInput.isMouseButtonPressed(Input.Buttons.LEFT)) {
                this.isStoveOn = !this.isStoveOn;
            }
        }
    }
}
