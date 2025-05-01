output "instance_public_ip" {
  value = module.app_server.instance_public_ip
}

output "private_key" {
  value     = module.app_server.private_key
  sensitive = true
}
