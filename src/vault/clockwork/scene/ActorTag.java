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
package vault.clockwork.scene;

import com.badlogic.gdx.utils.Array;
import java.util.Iterator;

/**
 * Provides actors tagging system.
 * Tag your actors to perform faster iterations.
 * @author Konrad Nowakowski https://github.com/konrad92
 */
public class ActorTag implements Iterable<Actor> {
    /**
     * Tag name.
     */
    public final String name;
    
    /**
     * Tagged actors with this tag.
     */
    public final Array<Actor> actors;
    
    /**
     * Actor tag constructor.
     * Initializes the actor array set.
     * @param name Name the tag.
     */
    public ActorTag(String name) {
        this.actors = new Array<>();
        this.name = name;
    }
    
    /**
     * Iterate through tagged actors.
     * @return Actors iterator assigned with this tag.
     */
    @Override
    public Iterator<Actor> iterator() {
        return actors.iterator();
    }
}