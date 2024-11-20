package com.mojh.coffeeorder.store.service;

import com.mojh.coffeeorder.common.FixtureMonkeyUtil;
import com.mojh.coffeeorder.owner.domain.Owner;
import com.mojh.coffeeorder.store.domain.Store;
import com.mojh.coffeeorder.store.dto.StoreResponseDto;
import com.mojh.coffeeorder.store.repository.StoreRepository;
import com.navercorp.fixturemonkey.FixtureMonkey;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@DisplayName("가게 서비스 단위 테스트")
@ExtendWith(MockitoExtension.class)
class StoreServiceTest {

    @Mock
    StoreRepository storeRepository;

    @InjectMocks
    StoreService storeService;

    private final FixtureMonkey fixtureMonkey = FixtureMonkeyUtil.baseFixtureMonkey();

    @Test
    @DisplayName("모든 가게 목록을 단순 조회한다.")
    void retrieveStoreList() {
        // given
        Owner owner = fixtureMonkey.giveMeOne(Owner.class);
        List<Store> storeList = fixtureMonkey.giveMeBuilder(Store.class)
                                             .set("owner", owner)
                                             .sampleList(5);
        given(storeRepository.findAll()).willReturn(storeList);

        // when
        List<StoreResponseDto> actual = storeService.retrieveStoreList();

        // then
        assertAll(
                () -> assertThat(actual.size()).isEqualTo(storeList.size()),
                () -> verify(storeRepository).findAll()
        );
    }

    @Test
    @DisplayName("조회된 가게가 하나도 없는 경우 빈 리스트를 반환한다.")
    void retrieveStoreList_empty() {
        // given
        given(storeRepository.findAll()).willReturn(Collections.EMPTY_LIST);

        // when
        List<StoreResponseDto> actual = storeService.retrieveStoreList();

        // then
        assertAll(
                () -> assertThat(actual).isEmpty(),
                () -> verify(storeRepository).findAll()
        );
    }


}
