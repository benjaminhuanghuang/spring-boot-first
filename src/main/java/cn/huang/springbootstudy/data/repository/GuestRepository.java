package cn.huang.springbootstudy.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.huang.springbootstudy.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}