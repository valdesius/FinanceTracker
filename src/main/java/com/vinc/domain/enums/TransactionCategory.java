package com.vinc.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public enum TransactionCategory {

    // Общие категории расходов
    GROCERIES("Groceries"),              // Продукты питания
    DINING_OUT("Dining Out"),            // Питание вне дома
    TRANSPORTATION("Transportation"),    // Транспорт
    UTILITIES("Utilities"),              // Коммунальные услуги
    HOUSING("Housing"),                  // Жилье
    CLOTHING("Clothing"),                // Одежда
    HEALTHCARE("Healthcare"),            // Здравоохранение
    ENTERTAINMENT("Entertainment"),      // Развлечения
    EDUCATION("Education"),              // Образование
    CHARITY("Charity"),                  // Благотворительность
    SAVINGS_INVESTMENTS("Savings & Investments"), // Сбережения и инвестиции
    GIFTS("Gifts"),                      // Подарки
    PERSONAL_CARE("Personal Care"),      // Личный уход
    KIDS("Kids"),                        // Расходы на детей
    PETS("Pets"),                        // Расходы на домашних животных
    ELECTRONICS("Electronics"),          // Электроника
    HOLIDAYS("Holidays"),                // Праздники/Отпуск
    HOME_IMPROVEMENT("Home Improvement"),// Домашнее улучшение
    INSURANCE("Insurance"),              // Страховка
    OTHER("Other");                      // Другое

    private final String displayName;


}

