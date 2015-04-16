/*
 * The MIT License
 *
 * Copyright 2015 raven.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package vault.clockwork.screens;

import static com.badlogic.gdx.Gdx.gl;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import vault.clockwork.Game;
import vault.clockwork.actors.BoxActor;
import vault.clockwork.actors.GroundActor;
import vault.clockwork.actors.TurretActor;

/**
 * Functionality preview scene.
 * Created and customized by the developer for new functionality testing.
 * @author Konrad Nowakowski https://github.com/konrad92
 */
public class PreviewScreen extends GameScreen {
    float frame = 0;
    
    @Override
    public void prepare() {
        Game.assets.load("assets/steamangel.png", Texture.class);
    }
    
    @Override
    public void show() {
        Game.world.add(new BoxActor(0));
        Game.world.add(new GroundActor(1));
        Game.world.add(new TurretActor(3));
    }

    @Override
    public void render(float delta) {
        // clear target buffer
        gl.glClearColor(0.f, 0.f, 0.f, 1.f);
        gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        
        Game.performSystemsJob(delta);
        
        frame += delta;
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }
}
