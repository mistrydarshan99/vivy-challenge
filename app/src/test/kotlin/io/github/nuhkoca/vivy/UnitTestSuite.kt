/*
 * Copyright (C) 2020. Nuh Koca. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.nuhkoca.vivy

import io.github.nuhkoca.vivy.data.model.LocationTest
import io.github.nuhkoca.vivy.data.service.DoctorsServiceTest
import io.github.nuhkoca.vivy.data.verifier.VivyHostnameVerifierTest
import io.github.nuhkoca.vivy.db.converters.DateTimeConverterTest
import io.github.nuhkoca.vivy.db.converters.LocationConverterTest
import io.github.nuhkoca.vivy.domain.mapper.DoctorsViewItemMapperTest
import io.github.nuhkoca.vivy.domain.repository.DoctorsRepositoryTest
import io.github.nuhkoca.vivy.ui.doctors.DoctorsViewModelTest
import io.github.nuhkoca.vivy.util.ext.StringExtTest
import io.github.nuhkoca.vivy.util.navigation.DetailContractTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * A unit test suite to execute all the test classes under this module.
 */
@RunWith(Suite::class)
@Suite.SuiteClasses(
    LocationTest::class,
    DoctorsServiceTest::class,
    VivyHostnameVerifierTest::class,
    DateTimeConverterTest::class,
    LocationConverterTest::class,
    DoctorsViewItemMapperTest::class,
    DoctorsRepositoryTest::class,
    DoctorsViewModelTest::class,
    StringExtTest::class,
    DetailContractTest::class
)
object UnitTestSuite
