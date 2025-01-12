package manta;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {
    private boolean changeScene = false;
    private float timeToChangeScene = 2.0f;

    public LevelEditorScene() {
        System.out.println("Inside Level Editor Scene");
    }

    @Override
    public void update(float dt) {
        if (!changeScene && KeyListener.isKeyPressed(KeyEvent.VK_SPACE)) {
            changeScene = true;
        }

        if (changeScene && timeToChangeScene > 0) {
            timeToChangeScene -= dt;
            Window.get().r -= dt * 5.0f;
            Window.get().g -= dt * 5.0f;
            Window.get().b -= dt * 5.0f;
        } else if (changeScene) {
            Window.changeScene(1);
        }
    }
}
