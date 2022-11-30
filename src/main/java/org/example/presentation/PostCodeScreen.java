package org.example.presentation;

import org.example.domain.usecase.GetZipCodeInformationUseCase;

public class PostCodeScreen {
    private final GetZipCodeInformationUseCase getZipCodeInformationUseCase;

    public PostCodeScreen(GetZipCodeInformationUseCase getZipCodeInformationUseCase) {
        this.getZipCodeInformationUseCase = getZipCodeInformationUseCase;
    }

    public void start() {
        System.out.println(getZipCodeInformationUseCase.getInformation(90210));
    }

}
