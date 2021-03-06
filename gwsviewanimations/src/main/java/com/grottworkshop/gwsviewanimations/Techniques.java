/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 daimajia
 * Modifications Copyright (C) 2015 Fred Grott(GrottWorkShop)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.grottworkshop.gwsviewanimations;

import com.grottworkshop.gwsviewanimations.attention.BounceAnimator;
import com.grottworkshop.gwsviewanimations.attention.FlashAnimator;
import com.grottworkshop.gwsviewanimations.attention.PulseAnimator;
import com.grottworkshop.gwsviewanimations.attention.RubberBandAnimator;
import com.grottworkshop.gwsviewanimations.attention.ShakeAnimator;
import com.grottworkshop.gwsviewanimations.attention.StandUpAnimator;
import com.grottworkshop.gwsviewanimations.attention.SwingAnimator;
import com.grottworkshop.gwsviewanimations.attention.TadaAnimator;
import com.grottworkshop.gwsviewanimations.attention.WaveAnimator;
import com.grottworkshop.gwsviewanimations.attention.WobbleAnimator;
import com.grottworkshop.gwsviewanimations.bouncingentrances.BounceInAnimator;
import com.grottworkshop.gwsviewanimations.bouncingentrances.BounceInDownAnimator;
import com.grottworkshop.gwsviewanimations.bouncingentrances.BounceInLeftAnimator;
import com.grottworkshop.gwsviewanimations.bouncingentrances.BounceInRightAnimator;
import com.grottworkshop.gwsviewanimations.bouncingentrances.BounceInUpAnimator;
import com.grottworkshop.gwsviewanimations.fadingentrances.FadeInAnimator;
import com.grottworkshop.gwsviewanimations.fadingentrances.FadeInDownAnimator;
import com.grottworkshop.gwsviewanimations.fadingentrances.FadeInLeftAnimator;
import com.grottworkshop.gwsviewanimations.fadingentrances.FadeInRightAnimator;
import com.grottworkshop.gwsviewanimations.fadingentrances.FadeInUpAnimator;
import com.grottworkshop.gwsviewanimations.fadingexits.FadeOutAnimator;
import com.grottworkshop.gwsviewanimations.fadingexits.FadeOutDownAnimator;
import com.grottworkshop.gwsviewanimations.fadingexits.FadeOutLeftAnimator;
import com.grottworkshop.gwsviewanimations.fadingexits.FadeOutRightAnimator;
import com.grottworkshop.gwsviewanimations.fadingexits.FadeOutUpAnimator;
import com.grottworkshop.gwsviewanimations.flippers.FlipInXAnimator;
import com.grottworkshop.gwsviewanimations.flippers.FlipOutXAnimator;
import com.grottworkshop.gwsviewanimations.flippers.FlipOutYAnimator;
import com.grottworkshop.gwsviewanimations.flippers.FlipYAnimator;
import com.grottworkshop.gwsviewanimations.rotatingentrances.RotateInAnimator;
import com.grottworkshop.gwsviewanimations.rotatingentrances.RotateInDownLeftAnimator;
import com.grottworkshop.gwsviewanimations.rotatingentrances.RotateInDownRightAnimator;
import com.grottworkshop.gwsviewanimations.rotatingentrances.RotateInUpLeftAnimator;
import com.grottworkshop.gwsviewanimations.rotatingentrances.RotateInUpRightAnimator;
import com.grottworkshop.gwsviewanimations.rotatingexits.RotateOutAnimator;
import com.grottworkshop.gwsviewanimations.rotatingexits.RotateOutDownLeftAnimator;
import com.grottworkshop.gwsviewanimations.rotatingexits.RotateOutDownRightAnimator;
import com.grottworkshop.gwsviewanimations.rotatingexits.RotateOutUpLeftAnimator;
import com.grottworkshop.gwsviewanimations.rotatingexits.RotateOutUpRightAnimator;
import com.grottworkshop.gwsviewanimations.sliders.SlideInDownAnimator;
import com.grottworkshop.gwsviewanimations.sliders.SlideInLeftAnimator;
import com.grottworkshop.gwsviewanimations.sliders.SlideInRightAnimator;
import com.grottworkshop.gwsviewanimations.sliders.SlideInUpAnimator;
import com.grottworkshop.gwsviewanimations.sliders.SlideOutDownAnimator;
import com.grottworkshop.gwsviewanimations.sliders.SlideOutLeftAnimator;
import com.grottworkshop.gwsviewanimations.sliders.SlideOutRightAnimator;
import com.grottworkshop.gwsviewanimations.sliders.SlideOutUpAnimator;
import com.grottworkshop.gwsviewanimations.specials.HingeAnimator;
import com.grottworkshop.gwsviewanimations.specials.RollInAnimator;
import com.grottworkshop.gwsviewanimations.specials.RollOutAnimator;
import com.grottworkshop.gwsviewanimations.specials.in.DropOutAnimator;
import com.grottworkshop.gwsviewanimations.specials.in.LandingAnimator;
import com.grottworkshop.gwsviewanimations.specials.out.TakingOffAnimator;
import com.grottworkshop.gwsviewanimations.zoomingentrances.ZoomInAnimator;
import com.grottworkshop.gwsviewanimations.zoomingentrances.ZoomInDownAnimator;
import com.grottworkshop.gwsviewanimations.zoomingentrances.ZoomInLeftAnimator;
import com.grottworkshop.gwsviewanimations.zoomingentrances.ZoomInRightAnimator;
import com.grottworkshop.gwsviewanimations.zoomingentrances.ZoomInUpAnimator;
import com.grottworkshop.gwsviewanimations.zoomingexits.ZoomOutAnimator;
import com.grottworkshop.gwsviewanimations.zoomingexits.ZoomOutDownAnimator;
import com.grottworkshop.gwsviewanimations.zoomingexits.ZoomOutLeftAnimator;
import com.grottworkshop.gwsviewanimations.zoomingexits.ZoomOutRightAnimator;
import com.grottworkshop.gwsviewanimations.zoomingexits.ZoomOutUpAnimator;

/**
 * Created by fgrott on 8/19/2015.
 */
public enum Techniques {

    DropOut(DropOutAnimator.class),
    Landing(LandingAnimator.class),
    TakingOff(TakingOffAnimator.class),

    Flash(FlashAnimator.class),
    Pulse(PulseAnimator.class),
    RubberBand(RubberBandAnimator.class),
    Shake(ShakeAnimator.class),
    Swing(SwingAnimator.class),
    Wobble(WobbleAnimator.class),
    Bounce(BounceAnimator.class),
    Tada(TadaAnimator.class),
    StandUp(StandUpAnimator.class),
    Wave(WaveAnimator.class),

    Hinge(HingeAnimator.class),
    RollIn(RollInAnimator.class),
    RollOut(RollOutAnimator.class),

    BounceIn(BounceInAnimator.class),
    BounceInDown(BounceInDownAnimator.class),
    BounceInLeft(BounceInLeftAnimator.class),
    BounceInRight(BounceInRightAnimator.class),
    BounceInUp(BounceInUpAnimator.class),

    FadeIn(FadeInAnimator.class),
    FadeInUp(FadeInUpAnimator.class),
    FadeInDown(FadeInDownAnimator.class),
    FadeInLeft(FadeInLeftAnimator.class),
    FadeInRight(FadeInRightAnimator.class),

    FadeOut(FadeOutAnimator.class),
    FadeOutDown(FadeOutDownAnimator.class),
    FadeOutLeft(FadeOutLeftAnimator.class),
    FadeOutRight(FadeOutRightAnimator.class),
    FadeOutUp(FadeOutUpAnimator.class),

    FlipInX(FlipInXAnimator.class),
    FlipOutX(FlipOutXAnimator.class),

    FlipOutY(FlipOutYAnimator.class),
    FlipY(FlipYAnimator.class),
    RotateIn(RotateInAnimator.class),
    RotateInDownLeft(RotateInDownLeftAnimator.class),
    RotateInDownRight(RotateInDownRightAnimator.class),
    RotateInUpLeft(RotateInUpLeftAnimator.class),
    RotateInUpRight(RotateInUpRightAnimator.class),

    RotateOut(RotateOutAnimator.class),
    RotateOutDownLeft(RotateOutDownLeftAnimator.class),
    RotateOutDownRight(RotateOutDownRightAnimator.class),
    RotateOutUpLeft(RotateOutUpLeftAnimator.class),
    RotateOutUpRight(RotateOutUpRightAnimator.class),

    SlideInLeft(SlideInLeftAnimator.class),
    SlideInRight(SlideInRightAnimator.class),
    SlideInUp(SlideInUpAnimator.class),
    SlideInDown(SlideInDownAnimator.class),

    SlideOutLeft(SlideOutLeftAnimator.class),
    SlideOutRight(SlideOutRightAnimator.class),
    SlideOutUp(SlideOutUpAnimator.class),
    SlideOutDown(SlideOutDownAnimator.class),

    ZoomIn(ZoomInAnimator.class),
    ZoomInDown(ZoomInDownAnimator.class),
    ZoomInLeft(ZoomInLeftAnimator.class),
    ZoomInRight(ZoomInRightAnimator.class),
    ZoomInUp(ZoomInUpAnimator.class),

    ZoomOut(ZoomOutAnimator.class),
    ZoomOutDown(ZoomOutDownAnimator.class),
    ZoomOutLeft(ZoomOutLeftAnimator.class),
    ZoomOutRight(ZoomOutRightAnimator.class),
    ZoomOutUp(ZoomOutUpAnimator.class);



    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
