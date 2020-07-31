package ru.skillbranch.kotlinexample.extensions

import kotlin.collections.Iterable

object Iterable {

    fun <T> List<T>.dropLastUntil(predicate: (T) -> Boolean): List<T>  {
        for (item in this){
            if(predicate(item)){
                val index = this.indexOf(item)
                return this.chunked(index).first()
            }
        }
        return emptyList()
    }
}