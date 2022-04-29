package ch.thipok.koinxrealm

import ch.thipok.koinxrealm.di.commonModules
import ch.thipok.koinxrealm.di.platformModules
import io.realm.Realm
import io.realm.RealmConfiguration
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import kotlin.test.BeforeTest
import kotlin.test.assertNotNull

class RepositoryTest : KoinTest {

    private val realmConfiguration : RealmConfiguration by inject()
    private val realm : Realm by inject()

    @BeforeTest
    fun setup() {

        startKoin{
            modules(
                commonModules(),
                platformModules()
            )
        }
    }

    @Test
    fun testRealmInit() {
        Realm.open(realmConfiguration)

        assertNotNull("PLEASE WORK")
    }

}

