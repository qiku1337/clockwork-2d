/*
 * The MIT License
 *
 * Copyright 2015 Konrad Nowakowski https://github.com/konrad92.
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
package vault.clockwork;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import vault.clockwork.screens.GameScreen;
import vault.clockwork.screens.LoaderScreen;
import vault.clockwork.screens.MenuScreen;

/**
 * Game main controller.
 * @author Konrad Nowakowski [http://github.com/konrad92]
 */
public class Game extends com.badlogic.gdx.Game {
    /**
     * Game main assets manager.
     * Manage game resources such as textures, sounds, musics etc. globally.
     */
    static public AssetManager assets;
    
    /**
     * Initialize loader for the new game screen.
     * Automate the loader initialization for next game screen.
     * @param next Screen to go.
     */
    static public void setGameScreen(GameScreen next) {
        ((Game)Gdx.app.getApplicationListener()).setScreen(new LoaderScreen(next));
    }
    
    /**
     * Performed after application succeed creation.
     * Initialize game global resources, loaders and scenes.
     */
    @Override
    public void create() {
        // create asset manager
        assets = new AssetManager();
        
        // prepare startup screen
        this.setScreen(new LoaderScreen(new MenuScreen()));
    }
    
    /**
     * Perform game screen rendering.
     */
    @Override
    public void render() {
        super.render();
    }
    
    /**
     * Dispose resources.
     * Release all game resources and assets.
     */
    @Override
    public void dispose() {
        super.dispose();
        
        assets.dispose();
    }
}
