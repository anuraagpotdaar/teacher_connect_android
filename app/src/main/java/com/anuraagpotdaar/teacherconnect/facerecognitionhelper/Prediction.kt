package com.anuraagpotdaar.teacherconnect.facerecognitionhelper

import android.graphics.Rect

data class Prediction( var bbox : Rect, var label : String)