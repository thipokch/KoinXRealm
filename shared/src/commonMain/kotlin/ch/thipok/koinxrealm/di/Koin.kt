package ch.thipok.koinxrealm.di


import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(
            commonModules(),
            platformModules()
        )
    }

// called by iOS
fun initKoin() = initKoin {}

fun commonModules() = module {}
