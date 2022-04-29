package ch.thipok.koinxrealm.di

import ch.thipok.koinxrealm.Person
import io.realm.Realm
import io.realm.RealmConfiguration
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModules() = module {
    single { RealmConfiguration.with(schema = setOf(Person::class)) }
    single { Realm.open(get()) }
}
