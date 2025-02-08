package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.business.mapper.generic.Mapper;
import com.francode.hotelBacked.domain.entity.Category;
import com.francode.hotelBacked.presentation.dto.request.CategoryRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.CategoryResponseDTO;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface CategoryMapper extends Mapper<CategoryRequestDTO, CategoryResponseDTO, Category> {

    @Override
    Category toEntity(CategoryRequestDTO dto);

    @Override
    CategoryResponseDTO toResponseDTO(Category entity);

    @Override
    void updateEntityFromDTO(CategoryRequestDTO dto, @MappingTarget Category entity);
}
