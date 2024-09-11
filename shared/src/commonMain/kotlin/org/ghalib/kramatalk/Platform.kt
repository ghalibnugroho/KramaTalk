package org.ghalib.kramatalk

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform