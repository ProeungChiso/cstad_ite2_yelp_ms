package kh.edu.cstad.user_profile.domain;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Language {
    ENGLISH("en", "English"),
    KHMER("km", "ខ្មែរ");

    private final String code;
    private final String displayName;

    public static Language fromCode(String code) {
        for (Language language : values()) {
            if (language.getCode().equalsIgnoreCase(code)) {
                return language;
            }
        }
        throw new IllegalArgumentException("Unknown language code: " + code);
    }

    @Converter(autoApply = true)
    public static class LanguageConverter implements AttributeConverter<Language, String> {
        @Override
        public String convertToDatabaseColumn(Language language) {
            if (language == null) {
                return null;
            }
            return language.getCode();
        }

        @Override
        public Language convertToEntityAttribute(String code) {
            if (code == null) {
                return null;
            }
            return Language.fromCode(code);
        }
    }
}
