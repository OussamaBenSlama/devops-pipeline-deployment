output "instance_public_ip" {
  value       = aws_instance.main_server.public_ip         # The actual value to be outputted
  description = "The public IP address of the EC2 instance" # Description of what this output represents
}

output "private_key" {
  description = "ssh key"
  value       = tls_private_key.ssh_key.private_key_pem
  sensitive   = true
}
