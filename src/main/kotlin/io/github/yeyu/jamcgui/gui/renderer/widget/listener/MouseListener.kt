package io.github.yeyu.jamcgui.gui.renderer.widget.listener

import io.github.yeyu.jamcgui.gui.handler.ScreenRendererHandler

/**
 * Keyboard and character input listener
 * */
interface MouseListener : Listener {

    /**
     * @implNote Invoked every time render method is invoked
     * @see io.github.yeyu.jamcgui.gui.renderer.ScreenRenderer.render
     */
    fun <T : ScreenRendererHandler> onMouseOver(mouseX: Int, mouseY: Int, handler: T)

    fun <T : ScreenRendererHandler> onMouseDown(
        mouseX: Double,
        mouseY: Double,
        button: Int,
        handler: T
    )

    fun <T : ScreenRendererHandler> onMouseUp(
        mouseX: Double,
        mouseY: Double,
        button: Int,
        handler: T
    )

    fun <T : ScreenRendererHandler> onMouseScroll(
        mouseX: Double,
        mouseY: Double,
        amount: Double,
        handler: T
    )

    fun <T : ScreenRendererHandler> onMouseMove(
        mouseX: Double,
        mouseY: Double,
        handler: T
    )

}