# Airtel Applicant Management System

## Overview

The Airtel Applicant Management System is a Java application designed to facilitate the registration and status tracking of telecom service applicants for Airtel in India. The system supports two applicant tiers: Tier 1 for new subscribers and Tier 2 for those migrating from an existing service provider.

## Features

- Registration and status tracking for Tier 1 and Tier 2 applicants.
- Validation of applicant information.
- Eligibility checks based on Aadhar number and old service registration number.
- Listing eligible female applicants.

## Classes

### `Applicant`

- Abstract class managing basic applicant information.
- Includes constructors, getters, setters, and methods for registration and status checking.

### `Tier1Applicant` (Extends `Applicant`)

- Represents Tier 1 applicants.
- Additional information: Annual Income, Occupation, Assets.

### `Tier2Applicant` (Extends `Applicant`)

- Represents Tier 2 applicants.
- Additional information: Old Service Provider details.

### `DBOperations`

- Utility class for database operations.
- Methods for calculating age, checking eligibility, and listing eligible female applicants.

## Rules for Applicant Object Creation

- An applicant should not get created if the First Name is not provided. An exception "IncompleteInformation" will be thrown if any data is missing.
- Applicant Id is automatically assigned the next integer number when an applicant is created.
