provider "azurerm" {
  skip_provider_registration = "true"

  features {
  }
}

locals {
  appenv = "${var.app}-${var.env}"
}

data "azurerm_resource_group" "resource-group" {
  name     = var.resource_group
}

resource "random_string" "random_suffix" {
  length  = 8
  special = false
  upper   = false
}

resource "azurerm_container_registry" "acr" {
  name                     = "${var.app}${var.env}${random_string.random_suffix.result}"
  resource_group_name      = data.azurerm_resource_group.resource-group.name
  location                 = data.azurerm_resource_group.resource-group.location
  sku                      = "Standard"
  admin_enabled            = false
}
