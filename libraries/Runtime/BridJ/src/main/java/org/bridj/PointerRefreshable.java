/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bridj;

/**
 *
 * @author ochafik
 */
public interface PointerRefreshable extends Pointable {
    PointerRefreshable setPointer(Pointer<?> pointer);
}