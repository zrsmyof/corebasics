package com.zrs.custom.patterns.creational.builder;

import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * @author zrs
 */
public class BankRequest {

    private ZonedDateTime requestDate;
    private UUID rqUid;
    private String clientName;
    private String clientSurname;
    private String clientMiddleName;
    private Integer clientAge;
    private Integer amount;

    public static class BankRequestBuilder {

        private ZonedDateTime requestDate;
        private UUID rqUid;
        private String clientName;
        private String clientSurname;
        private String clientMiddleName;
        private Integer clientAge;
        private Integer amount;

        public BankRequestBuilder() {
        }

        BankRequestBuilder withRequestDate(ZonedDateTime requestDate) {
            this.requestDate = requestDate;
            return this;
        }

        BankRequestBuilder withRqUid(UUID rqUid) {
            this.rqUid = rqUid;
            return this;
        }

        BankRequestBuilder withClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        BankRequestBuilder withClientSurname(String clientSurname) {
            this.clientSurname = clientSurname;
            return this;
        }

        BankRequestBuilder withClientMiddleName(String clientMiddleName) {
            this.clientMiddleName = clientMiddleName;
            return this;
        }

        BankRequestBuilder withClientAge(int clientAge) {
            this.clientAge = clientAge;
            return this;
        }

        BankRequestBuilder withAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public BankRequest build() {
            BankRequest bankRequest = new BankRequest();
            bankRequest.requestDate = this.requestDate;
            bankRequest.rqUid = this.rqUid;
            bankRequest.clientName = this.clientName;
            bankRequest.clientSurname = this.clientSurname;
            bankRequest.clientMiddleName = this.clientMiddleName;
            bankRequest.clientAge = this.clientAge;
            bankRequest.amount = this.amount;
            return bankRequest;
        }
    }

    @Override
    public String toString() {
        return "BankRequest{" +
                "requestDate=" + requestDate +
                ", rqUid=" + rqUid +
                ", clientName='" + clientName + '\'' +
                ", clientSurname='" + clientSurname + '\'' +
                ", clientMiddleName='" + clientMiddleName + '\'' +
                ", clientAge=" + clientAge +
                ", amount=" + amount +
                '}';
    }
}
