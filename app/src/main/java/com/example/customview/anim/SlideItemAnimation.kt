package com.example.customview.anim

import android.view.ViewPropertyAnimator
import androidx.recyclerview.widget.RecyclerView

/**
 *      date    : 2019/05/15
 */
class SlideItemAnimation(animDuration: Long = 500) : SuperItemAnimation(animDuration) {

    override fun setAddItemAnimInit(holder: RecyclerView.ViewHolder?) {
        val with = holder?.itemView?.width ?: 0
        holder?.itemView?.translationX = -with.toFloat()
    }

    override fun setAddItemAnim(holder: RecyclerView.ViewHolder?, animator: ViewPropertyAnimator?) {
        animator?.translationX(0f)
    }

    override fun setAddItemAnimCancel(holder: RecyclerView.ViewHolder?) {
        holder?.itemView?.translationX = 0f
    }

    override fun setRemoveItemAnim(holder: RecyclerView.ViewHolder?, animator: ViewPropertyAnimator?) {
        val with = holder?.itemView?.width ?: 0
        animator?.translationX(-with.toFloat())
    }

    override fun setRemoveItemAnimEnd(holder: RecyclerView.ViewHolder?) {
        holder?.itemView?.translationX = 0f
    }

}